package com.aliyuolalekan.portfolio.components.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.aliyuolalekan.portfolio.components.widgets.SectionTitle
import com.aliyuolalekan.portfolio.components.widgets.SkillBar
import com.aliyuolalekan.portfolio.models.Section
import com.aliyuolalekan.portfolio.models.Skill
import com.aliyuolalekan.portfolio.models.Theme
import com.aliyuolalekan.portfolio.styles.AboutImageStyle
import com.aliyuolalekan.portfolio.styles.AboutTextStyle
import com.aliyuolalekan.portfolio.util.Constants
import com.aliyuolalekan.portfolio.util.Constants.LOREM_IPSUM_LONG
import com.aliyuolalekan.portfolio.util.Constants.SECTION_WIDTH
import com.aliyuolalekan.portfolio.util.ObserveViewportEntered
import com.aliyuolalekan.portfolio.util.Res
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import com.aliyuolalekan.portfolio.util.animatePercentage
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontStyle
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutSection() {
    Box(
        modifier = Modifier
            .id(Section.About.id)
            .maxWidth(SECTION_WIDTH.px)
            .padding(150.px),
        contentAlignment = Alignment.Center
    ) {
        AboutContent()
    }
}

@Composable
fun AboutContent() {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier.fillMaxWidth(
            if (breakpoint >= Breakpoint.MD) 100.percent
            else 90.percent
        )
            .maxWidth(1200.px)
    ) {
        SimpleGrid(
            numColumns(base = 1, md = 2), modifier = Modifier.fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 90.percent
                else 100.percent
            )
        ) {
            if (breakpoint >= Breakpoint.MD) {
                AboutImage()
            }
            AboutMe()
        }
    }
}

@Composable
fun AboutImage() {
    Box {
        Image(
            modifier = AboutImageStyle.toModifier().fillMaxWidth(80.percent),
            src = Res.Image.aboutImage,
            desc = "About Image"
        )
    }
}

@Composable
fun AboutMe() {
    var viewportEntered by remember { mutableStateOf(false) }
    val animatedPercentage = remember { mutableStateListOf(0, 0, 0, 0, 0) }
    val scope = rememberCoroutineScope()
    ObserveViewportEntered(
        sectionId = Section.About.id,
        distanceFromTop = 300.0
    ) {
        viewportEntered = true
        Skill.entries.forEach {skill ->
            scope.launch {
                animatePercentage(
                    percent = skill.percentage.value.toInt(),
                    onUpdate = {
                        animatedPercentage[skill.ordinal] = it
                    }
                )
            }
        }
    }

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {
        SectionTitle(section = Section.About)
        P(
            attrs = AboutTextStyle
                .toModifier()
                .margin(bottom = 25.px, top = 25.px)
                .maxWidth(500.px)
                .fontFamily(Constants.FONT_FAMILY)
                .fontSize(18.px)
                .fontStyle(FontStyle.Italic)
                .fontWeight(FontWeight.Normal)
                .color(Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text(LOREM_IPSUM_LONG)
        }
        Skill.entries.forEach { skill ->
            SkillBar(
                name = skill.name,
                index = skill.ordinal,
                percentage = if (viewportEntered) skill.percentage else 0.percent,
                animatePercentage = if (viewportEntered) animatedPercentage[skill.ordinal] else 0
            )
        }
    }
}