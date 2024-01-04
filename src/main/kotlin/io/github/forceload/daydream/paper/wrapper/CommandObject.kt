package io.github.forceload.daydream.paper.wrapper

import io.github.forceload.daydream.paper.event.CommandExecuteEvent

abstract class CommandObject {
    var aliases: List<String> = ArrayList()
    var description: String = ""
    var permission: String = ""
    var label: String = ""
    var usage: String = ""

    abstract fun execute(event: CommandExecuteEvent): Boolean
    abstract fun tabComplete(): MutableList<String>?
}