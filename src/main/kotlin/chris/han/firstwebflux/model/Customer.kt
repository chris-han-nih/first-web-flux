package chris.han.firstwebflux.model

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class Customer(
  var id: Int = 0,
  val name: String = "",
  val telephone: Telephone? = null,
)

data class Telephone(
  val countryCode: String = "",
  val telephoneNumber: String = "",
)
