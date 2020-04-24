
lazy val akkaHttpVersion = "10.1.11"
lazy val akkaVersion    = "2.6.4"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      name := "akka-s3-loggin"
    )),
    name := "TestProject",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor"             % akkaVersion,
      "com.typesafe.akka" %% "akka-slf4j"             % akkaVersion,
      "com.typesafe.akka" %% "akka-testkit"           % akkaVersion   % "test",
      "com.typesafe.akka" %% "akka-http-spray-json"   % "10.0.10",
      "com.typesafe.play" %% "play-ws-standalone-json"        % "1.1.8",
      "ch.qos.logback"    %  "logback-classic"                % "1.2.3",
      "de.heikoseeberger" %% "akka-http-play-json"            % "1.23.0",
      "de.heikoseeberger" %% "akka-http-play-json"            % "1.23.0",
      "org.scalatest"     %% "scalatest"                      % "3.0.5"       % "test",
    ),

    testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")
  )
