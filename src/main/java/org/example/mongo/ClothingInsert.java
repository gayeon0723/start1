package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ClothingInsert {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("quiz");
        MongoCollection<Document> collection = database.getCollection("product");

        Document clothingData = new Document("category", "Clothing")
                .append("brand", "Nike");
        collection.deleteMany(clothingData);

        System.out.println("브랜드가 Nike인 Clothing 카테고리 의 상품이 삭제되었습니다.");

        mongoClient.close();
    }
}
