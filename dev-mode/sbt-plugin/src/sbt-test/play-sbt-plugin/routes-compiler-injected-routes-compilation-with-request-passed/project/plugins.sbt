//
// Copyright (C) 2009-2019 Lightbend Inc. <https://www.lightbend.com>
//

updateOptions := updateOptions.value.withLatestSnapshots(false)
addSbtPlugin("com.typesafe.play" % "sbt-plugin"         % sys.props("project.version"))
addSbtPlugin("com.typesafe.play" % "sbt-scripted-tools" % sys.props("project.version"))
addSbtPlugin("com.typesafe.sbt"  % "sbt-mocha"          % "1.1.2")