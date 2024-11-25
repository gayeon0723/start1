package org.example.mongo;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;
import java.util.concurrent.TimeUnit;
import org.bson.Document;
import com.mongodb.client.FindIterable;

public class 연결테스트2 {
    public static void main(String[] args) {

        Bson filter = new Document("tel", "570-388-6851");
        Bson project = new Document();

        MongoClient mongoClient = new MongoClient(
                new MongoClientURI(
                        "mongodb://localhost:27017/"
                )
        );
        MongoDatabase database = mongoClient.getDatabase("shop");
        MongoCollection<Document> collection = database.getCollection("member");
        FindIterable<Document> result = collection.find(filter)
                .projection(project);
        System.out.println(result.first().getString("id"));
        System.out.println(result.first().getString("pw"));
        System.out.println(result.first().getString("name"));
        System.out.println(result.first().getString("tel"));
    }
}
