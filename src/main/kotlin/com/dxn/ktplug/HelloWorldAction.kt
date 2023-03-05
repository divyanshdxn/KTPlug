package com.dxn.ktplug

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class HelloWorldAction: AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        Messages.showMessageDialog("Hello World from KTPlug", "KTPlug", Messages.getInformationIcon())
    }
}