package com.ayman;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.List;
import java.util.UUID;

@Path("/artists")
public class ArtistResource {

    private static List<Artist> artists = List.of(
        new Artist().id(UUID.randomUUID()).firstName("Ayman").lastName("Patel"),
        new Artist().id(UUID.randomUUID()).firstName("Chinmay").lastName("Kalegaonkar"),
        new Artist().id(UUID.randomUUID()).firstName("Shrey Randive").lastName("Patel")

    );

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllArtists() {

        return Response.ok(artists).build();
    }

    @GET
    @Path("/count")
    @Produces(MediaType.APPLICATION_JSON)
    public Response countArtists() {
        return Response.ok(artists.size()).build();
    }

}