package scala.build

import sbt._

/** This object defines keys that should be visible with an unqualified name in all .sbt files and the command line */
object BuildSettings extends AutoPlugin {
  object autoImport {
    lazy val baseVersion = settingKey[String]("The base version number from which all others are derived")
    lazy val baseVersionSuffix = settingKey[String]("Identifies the kind of version to build")
  }
}
