package top.roy1994.bilimusic.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.ViewModel
import top.roy1994.bilimusic.R
import top.roy1994.bilimusic.data.struct.Music
import top.roy1994.bilimusic.data.struct.TopSelectBarCategory

class MusicRecentViewModel: ViewModel() {
    val _5FirstRecent = mutableStateOf(
        (0 until 5).map {
            Music(
                id = it,
                name = "歌曲${it}",
                artist = "作者${it}",
            )
        }
    )
}


