package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class BooksInsert {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("quiz");
        MongoCollection<Document> collection = database.getCollection("product");

        Document booksData = new Document("category", "Books")
                .append("price", new Document("$gte", 25000));
        for (Document product : collection.find(booksData)) {
            System.out.println("검색된 상품 : " + product.toJson());
        }
        collection.deleteMany(booksData);

        System.out.println("가격이 25000 이상인 Books 카테고리 의 상품이 삭제되었습니다.");

        mongoClient.close();
    }
}
