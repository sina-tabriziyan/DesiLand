package com.sina.desiland.sections

import androidx.compose.runtime.Composable
import com.sina.desiland.util.Constants.SECTION_WITH
import com.sina.desiland.util.Res
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.px

@Composable
fun MainSection() {
    Box(
        modifier = Modifier.maxWidth(SECTION_WITH),
        contentAlignment = Alignment.TopCenter
    ) {
        MainBackground()
    }
}

@Composable
fun MainBackground() {
    Image(
        src = Res.Image.background,
        description = "",
        modifier = Modifier.fillMaxSize().objectFit(ObjectFit.Fill),
    )
}