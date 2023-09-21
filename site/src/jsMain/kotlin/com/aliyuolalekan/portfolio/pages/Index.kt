package com.aliyuolalekan.portfolio.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.aliyuolalekan.portfolio.components.sections.AboutSection
import com.aliyuolalekan.portfolio.components.sections.ContactSection
import com.aliyuolalekan.portfolio.components.sections.ExperienceSection
import com.aliyuolalekan.portfolio.components.sections.FooterSection
import com.aliyuolalekan.portfolio.components.sections.MainSection
import com.aliyuolalekan.portfolio.components.sections.PortfolioSection
import com.aliyuolalekan.portfolio.components.sections.ServiceSection
import com.aliyuolalekan.portfolio.components.sections.TestimonialSection
import com.aliyuolalekan.portfolio.components.widgets.BackToTopButton
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.aliyuolalekan.portfolio.components.widgets.OverflowMenu
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun HomePage() {
    var menuOpened by remember { mutableStateOf(false) }
    Box (
        modifier = Modifier.fillMaxSize()
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MainSection {
                menuOpened = true
            }
            AboutSection()
            ServiceSection()
            PortfolioSection()
            TestimonialSection()
            ExperienceSection()
            ContactSection()
            FooterSection()
        }
    }
    BackToTopButton()
    if (menuOpened) {
        OverflowMenu { menuOpened = false }
    }
}
