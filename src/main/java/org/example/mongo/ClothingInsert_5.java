package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ClothingInsert_5 {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("quiz");
        MongoCollection<Document> collection = database.getCollection("product");

        Document clothingData = new Document("category", "Clothing")
                .append("price", new Document("$gte", 30000));
        collection.deleteMany(clothingData);

        System.out.println("가격이 30000이상인 Clothing 카테고리의 모든 상품이 삭제되었습니다.");

        mongoClient.close();
    }
}
