package com.dxn.ktplug

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.fileChooser.FileChooser
import com.intellij.openapi.fileChooser.FileChooserDescriptor
import com.intellij.openapi.ui.Messages
import com.intellij.util.Consumer

class FileChooseAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val fcdesc = FileChooserDescriptor(
            true,
            false,
            false,
            false,
            false,
            false
        )
            .apply {
                title = "Choose file for KTPlug"
                description = "This is sample file chooser for KTPLug"
            }
        FileChooser.chooseFile(fcdesc, e.project, null) {
            Messages.showMessageDialog(e.project, it.path, "Path of the file", Messages.getInformationIcon())
        }

    }
}