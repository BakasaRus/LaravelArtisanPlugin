package laravel.artisan.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import laravel.artisan.ui.MakeControllerDialog as Dialog

class MakeController : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        Dialog.main(e.project?.basePath)
    }
}