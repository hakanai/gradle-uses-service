import com.example.gradle.services.MyService

val myService = gradle.sharedServices.registerIfAbsent("my-service", MyService::class) {
    println("*** my-service configuration block called")
}

tasks.withType<Test>().configureEach {
    usesService(myService)
    println("*** usesService called for task: $this")

    doFirst {
        println("*** test task being run: $this")
    }
}
