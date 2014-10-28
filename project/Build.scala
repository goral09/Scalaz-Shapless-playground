import sbt._
import sbt.Keys._

object ScalazshapelessplaygroundBuild extends Build {

  lazy val scalazshapelessplayground = Project(
    id = "scalaz-shapeless-playground",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "scalaz-shapeless-playground",
      organization := "com.goral09",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.11.2"
      // add other settings here
    )
  )
}
