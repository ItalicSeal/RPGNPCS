package me.italicseal.rpgnpcs;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import org.bukkit.Server;

import java.io.InputStreamReader;
import java.util.Objects;

public class AbstractionLoader {
    private String implementationName;

    public void loadLocalAbstractions(Server server) {
        JsonParser parser = new JsonParser();
        JsonObject versions = parser.parse(new JsonReader(
                new InputStreamReader(
                        Objects.requireNonNull(
                                this.getClass().getClassLoader().getResourceAsStream("version_info.json")
                        )
                )
        )).getAsJsonObject();

        this.implementationName = versions.getAsJsonPrimitive(server.getVersion().substring(server.getVersion().indexOf("MC") + 4, server.getVersion().length() - 1)).getAsString();
    }

    public String getServerVersion(){
        return implementationName;
    }
}
