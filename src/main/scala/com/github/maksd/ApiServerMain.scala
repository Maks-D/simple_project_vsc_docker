package com.github.maksd

object ApiServerMain extends cask.MainRoutes {

  @cask.get("/id/:userId")
  def getUserById(userId: String): String = userId

  initialize()
}
