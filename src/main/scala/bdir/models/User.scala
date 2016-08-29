package bdir.models


case class User(userName: String, password: String) {
  require(userName != null && password != null && userName.nonEmpty && password.nonEmpty)
}
