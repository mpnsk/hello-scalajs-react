name := "hello-scalajs-react"

version := "0.1"

scalaVersion := "3.0.1"

idePackagePrefix := Some("com.example")

enablePlugins(ScalaJSPlugin)
scalaJSUseMainModuleInitializer := true

enablePlugins(ScalaJSBundlerPlugin)

libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "2.0.0-RC3"

npmDependencies in Compile ++= Seq(
  "react" -> "17.0.2",
  "react-dom" -> "17.0.2")