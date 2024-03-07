package com.example.aiplanner.presentation.onboarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.aiplanner.R
import com.example.aiplanner.presentation.onboarding.components.OnBoardingButton
import com.example.aiplanner.presentation.onboarding.components.OnBoardingEvent
import com.example.aiplanner.presentation.onboarding.components.OnBoardingText
import com.example.aiplanner.presentation.onboarding.components.PageIndicator
import com.example.aiplanner.presentation.onboarding.components.onboardingphone.OnBoardingPhoneFrame
import com.example.aiplanner.presentation.onboarding.components.pages
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen(
    event: (OnBoardingEvent) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.system_screens_background))
    ) {
        val pagerState = rememberPagerState(initialPage = 0) {
            pages.size
        }
        val buttonState = remember {
            derivedStateOf {
                when (pagerState.currentPage) {
                    0 -> "Next"
                    1 -> "Next"
                    2 -> "Get Started"
                    else -> ""
                }
            }
        }
        val scope = rememberCoroutineScope()
        Box(
            modifier = Modifier
                .fillMaxHeight(0.4f)
                .fillMaxWidth()
                .align(Alignment.TopCenter)
        ) {
            PageIndicator(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(top = 40.dp, start = 20.dp),
                pageSize = 3,
                selectedPage = pagerState.currentPage
            )
            OnBoardingText(
                modifier = Modifier
                    .padding(start = 20.dp)
                    .align(Alignment.Center),
                page = pages[pagerState.currentPage]
            )
            OnBoardingButton(
                modifier = Modifier
                    .padding(start = 20.dp)
                    .align(Alignment.BottomStart),
                buttonText = buttonState.value
            ) {
                scope.launch {
                    if (pagerState.currentPage == 2) {
                        event(OnBoardingEvent.SavedAppEntry)
                    } else {
                        pagerState.animateScrollToPage(page = pagerState.currentPage + 1)
                    }
                }
            }
        }
        HorizontalPager(
            modifier = Modifier
                .fillMaxHeight(0.6f)
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            state = pagerState, userScrollEnabled = false
        ) {
            OnBoardingPhoneFrame(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
            )
        }
    }
}

