package com.github.catapan.graphql.people;

import java.util.Collections;
import java.util.List;

import com.github.catapan.graphql.address.Address;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Source;

@GraphQLApi
public class PeopleResource {
  
  @Query
  @Name("getPeople")
  public List<People> getPeople() {
    People people = new People();
    people.setName("Danilo Catapan");
    people.setAge(23);
    return Collections.singletonList(people);
  }

  @Name("getAddress")
  public Address getAddress(@Source People people) {
    Address address = new Address();
    address.setStreet("Saint Catarina");
    address.setNumber(123);
    return address;
  }
}
