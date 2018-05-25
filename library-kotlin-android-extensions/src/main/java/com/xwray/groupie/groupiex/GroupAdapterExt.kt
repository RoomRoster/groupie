package com.xwray.groupie.groupiex

import com.xwray.groupie.Group
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Section
import com.xwray.groupie.ViewHolder

operator fun GroupAdapter<ViewHolder>.plusAssign(element: Group) = this.add(element)


operator fun GroupAdapter<ViewHolder>.plusAssign(groups: MutableCollection<out Group>) = this.addAll(groups)


operator fun GroupAdapter<ViewHolder>.minusAssign(element: Group) = this.remove(element)


operator fun GroupAdapter<ViewHolder>.minusAssign(groups: MutableCollection<out Group>)  = this.removeAll(groups)


fun Group() {
    val groupAdapter = GroupAdapter<ViewHolder>()
    groupAdapter += Section()
    groupAdapter += mutableListOf<Section>(Section(), Section())
}
