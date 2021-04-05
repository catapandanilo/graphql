package com.github.catapan.graphql.address;

import java.util.Collections;
import java.util.List;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
public class AddressResource {
  
  @Query
  @Name("getAddress")
  public List<Address> getAddress() {
    Address address = new Address();
    address.setStreet("Saint Catarina");
    address.setNumber(123);
    return Collections.singletonList(address);
  }
}
