import org.gradle.api.Plugin
import org.gradle.api.Project

class BuildTimePlugin : Plugin<Project> {
  override fun apply(project: Project) {
    project.tasks.register("buildTime") {
      project.tasks.findByName("assemble")?.finalizedBy(it)
      Thread.sleep(10000)
      it.doLast {
        Thread.sleep(10000)
      }
    }
  }
}
