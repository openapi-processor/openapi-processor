openapiProcessor {
    // to re-use it below
    val basePath = "${projectDir}/src/main/kotlin/io/openapiprocessor/samples"

    // Bar module configuration
    process("Bar") { // <1>
        processorName("spring")
        processor("${oap.processor.spring.get()}")

        val barPath = "${basePath}/bar/api" // <2>
        apiPath("${barPath}/openapi.yaml")
        targetDir("$projectDir/build/openapi/bar")

        prop("mapping", layout.projectDirectory.file("${barPath}/mapping.yaml")) // <3>
    }

    // Foo module configuration
    process("Foo") { // <1>
        processorName("spring")
        processor("${oap.processor.spring.get()}")

        val fooPath = "${basePath}/foo/api"  // <2>
        apiPath("${fooPath}/openapi.yaml")
        targetDir("$projectDir/build/openapi/foo")

        prop("mapping", layout.projectDirectory.file("${fooPath}/mapping.yaml")) // <3>
    }
}

// tell the build to compile the generated files
sourceSets {
    main {
        java {
            srcDir(layout.buildDirectory.dir("openapi/bar/java")) // <4>
            srcDir(layout.buildDirectory.dir("openapi/foo/java"))
        }
        resources {
            srcDir(layout.buildDirectory.dir("openapi/bar/resources")) // <4>
            srcDir(layout.buildDirectory.dir("openapi/foo/resources"))
        }
    }
}

// generate api before compiling
tasks.withType<KotlinCompile> {
    dependsOn("processBar", "processFoo") // <5>
}

// generate api resource before processing
tasks.withType<ProcessResources> {
    dependsOn("processBar", "processFoo") // <5>
}
