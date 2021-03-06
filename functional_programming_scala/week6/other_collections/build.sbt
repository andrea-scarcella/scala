lazy val root = (project in file(".")).
  settings(
    name := "other_collections",
    version := "1.0",
    scalaVersion := "2.11.4"
  )
  libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
  scalacOptions +="-deprecation"
//__libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"