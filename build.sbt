import com.typesafe.sbt.site.SphinxSupport.Sphinx

name := "sbt-site-config-example"
organization := "com.exitium"
scalaVersion := "2.11.6"

site.settings
sourceDirectory in Sphinx := baseDirectory.value / "docs"
site.includeScaladoc()
site.sphinxSupport()

scalacOptions in (Compile, doc) := Seq(
  "-diagrams", "-groups", "-implicits"
)
autoAPIMappings := true
