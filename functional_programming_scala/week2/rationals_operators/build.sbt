lazy val root = (project in file(".")).
  settings(
    name := "rational_oprators",
    version := "1.0",
    scalaVersion := "2.11.4"
  )
  libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
//__libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"