package com.github.catapan.graphql.people;

import java.util.List;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
public class PeopleResource {
  
  @Query
  @Name("getPeoples")
  public List<People> getPeoples() {
    return null;
  }
}
