package com.example.vladivostok.ui.ru

import androidx.lifecycle.ViewModel
import com.example.vladivostok.R

class RuViewModel : ViewModel() {

    var itemsRusskiyList: List<Triple< String, Int, String>> = listOf(
        Triple( "Русский мост", R.drawable.most_ru, "Живописный вантовый мост"),
        Triple( "Кампус ДВФУ", R.drawable.mr, "Современный кампус Дальневосточного Федерально Университета."),
        Triple("Бухта Новик", R.drawable.novik,"Бухта в акватории Японского моря, у берегов Русского острова."),
        Triple("Новосильцевская батарея", R.drawable.novosil,"Входит в комплекс фортификационных сооружений Владивостокской крепости."),
        Triple("Мыс Тобизина", R.drawable.tobizina,"Самый южный мыс острова Русский."),
        Triple("Приморский океанариум", R.drawable.ocen,"Научно-образовательный комплекс, филиал Национального научного центра морской биологии ДВО РАН."),
    )

    fun getList() : List<Triple<String, Int, String>> {
        return itemsRusskiyList
    }

}