package com.github.catapan.graphql.address;

import java.util.List;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
public class AddressResource {
  
  @Query
  @Name("getAddress")
  public List<Address> getAddress() {
    return null;
  }
}
