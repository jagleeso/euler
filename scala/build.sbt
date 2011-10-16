name := "scala-euler"

version := "1.0"

scalaVersion := "2.9.1"

organization := "james.exercises.euler"

// add a test dependency on ScalaCheck
libraryDependencies += "org.scala-tools.testing" %% "scalacheck" % "1.9" % "test"

// add a test dependency on ScalaTest 
libraryDependencies += "org.scalatest" %% "scalatest" % "1.6.1" % "test"

// set the main Scala source directory to be <base>/src
scalaSource in Compile <<= baseDirectory(_ / "src")

// set the Scala test source directory to be <base>/test
scalaSource in Test <<= baseDirectory(_ / "test")
