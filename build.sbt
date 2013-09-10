name := "mongo-hadoop"

organization := "org.mongodb"

publishMavenStyle := true

publishTo := Some(Resolver.file("file", new File(Path.userHome.absolutePath+"/.m2/repository")))

hadoopRelease in ThisBuild := "cdh4"

