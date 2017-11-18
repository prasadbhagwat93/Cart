package com.example.prasad.myapplication;

import android.support.v7.app.AppCompatActivity;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.*;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
//import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.*
/**
 * Created by prasad on 11/18/17.
 */
public class DynamoDBClass extends AppCompatActivity {

    CognitoCachingCredentialsProvider credentialsProvider;
    AmazonDynamoDBClient ddbClient;
    DynamoDBMapper mapper;
    DynamoDBClass() {
         this.credentialsProvider = new CognitoCachingCredentialsProvider(
                getApplicationContext(),    /* get the context for the application */
                "us-east-1_FRKZmmd4rf",    /* Identity Pool ID */
                Regions.US_EAST_1           /* Region for your identity pool--US_EAST_1 or EU_WEST_1*/
        );
         this.ddbClient = new AmazonDynamoDBClient(credentialsProvider);
        this.mapper = new DynamoDBMapper(ddbClient);


    }

    public void addItems(){

    }



}
