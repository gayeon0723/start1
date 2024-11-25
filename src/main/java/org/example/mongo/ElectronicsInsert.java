package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ElectronicsInsert {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("quiz");
        MongoCollection<Document> collection = database.getCollection("product");

        Document eletronicData = new Document("category", "Electronics")
                .append("price", new Document("$gte", 1000000));
        for (Document product : collection.find(eletronicData)) {
            System.out.println("검색된 상품 : " + product.toJson());
        }

        mongoClient.close();
    }
}
