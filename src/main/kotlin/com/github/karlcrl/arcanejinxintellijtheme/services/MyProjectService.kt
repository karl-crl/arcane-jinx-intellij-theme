package com.github.karlcrl.arcanejinxintellijtheme.services

import com.intellij.openapi.project.Project
import com.github.karlcrl.arcanejinxintellijtheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
