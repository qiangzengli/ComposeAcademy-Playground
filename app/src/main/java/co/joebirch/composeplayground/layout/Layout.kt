package co.joebirch.composeplayground.layout

import co.joebirch.composeplayground.Category
import co.joebirch.composeplayground.ComposableLayout

sealed class Layout(
    override val label: String,
    override val intent: ComposableLayout? = null
) : Category(label, intent) {

    object Heading : Layout("Layout")
    object Column : Layout("Column", ColumnView)
    object ScrollableColumn : Layout("ScrollableColumn", ScollableColumnView)
    object HorizontalArrangement : Layout("Horizontal Arrangement", HorizontalArrangementView)
    object FlowColumn : Layout("Flow Column", FlowColumnView)
    object Row : Layout("Row", RowView)
    object Spacer : Layout("Spacer", SpacerView)
    object Stack : Layout("Stack", StackView)
    object VerticalArrangement : Layout("Vertical Arrangement", VerticalArrangementView)

}
