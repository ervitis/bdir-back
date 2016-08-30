package bdir.models


case class User(id: String, userName: String, password: String) {
  require(id != null && userName != null && password != null && userName.nonEmpty && password.nonEmpty && id.nonEmpty)
}
