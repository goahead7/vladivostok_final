package com.example.vladivostok.ui.vl

import androidx.lifecycle.ViewModel
import com.example.vladivostok.R

class VlViewModel : ViewModel() {

    var itemsVladivostokList: List<Triple< String, Int, String>> = listOf(
        Triple( "Золотой мост",R.drawable.gb, "Вантовый мост через бухту Золотой Рог."),
        Triple("Токаревский маяк",R.drawable.mayak,"Действующий маяк во Владивостоке."),
        Triple("Картинная Галерея",R.drawable.galery,"Единственный музей в Приморье с редкой коллекцией произведений русского и западноевропейского искусства."),
        Triple("Владивостокская крепость",R.drawable.krepost,"Комплекс уникальных долговременных оборонительных сооружений, построенный в конце XIX века."),
        Triple("Нагорный парк",R.drawable.nagorny,"Нагорный парк находится в районе пересечения улиц Шилкинской, Тюменской и Всеволода Сибирцева.")
    )

    fun getList() : List<Triple<String, Int, String>> {
        return itemsVladivostokList
    }

}