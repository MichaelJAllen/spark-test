// SBT build file, equivalent to that presented in OP's original question.

// Equivalent of Maven artifact ID.
name := "Scala_tests"

// Equivalent of Maven group ID.
organization := "Scala_tests"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.7"

val sparkVersion = "2.4.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)