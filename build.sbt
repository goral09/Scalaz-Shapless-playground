resolvers ++= Seq(
	"Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
	"Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases",
	Resolver.sonatypeRepo("releases"),
	Resolver.sonatypeRepo("snapshots")
)
 
libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.1.0",
  "com.chuusai" %% "shapeless" % "2.0.0",
  "org.scalaz.stream" %% "scalaz-stream" % "0.6a"
)
 
initialCommands in console := "import scalaz._, Scalaz._, shapeless._"

incOptions := incOptions.value.withNameHashing(false)
