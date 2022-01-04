#! /bin/bash
sbt clean assembly
scala -J-Xmx2g -classpath "./target/scala-2.12/simple_project-assembly-0.1.0-SNAPSHOT.jar" com.github.maksd.ApiServerMain
