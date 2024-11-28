// used to create a collection with Validation
db.createCollection("user", {
    validator: {
        $jsonSchema: {
            required: ["name", "age"],
            properties: {
                name:{
                    bsonType: "string",
                    description: "enter string type"
                },
                age:{
                    bsonType: "number",
                    
                    description: "enter number type"
                }
            }
        }
    },
    validationAction: 'error'
})



// TO modify the Validation of the collection
db.runCommand(
    {
        collMod: "user",
            validator: {
                $jsonSchema: {
                required: ["name","cost","author"],
                properties: {
                    name: {
                        bsonType: "string",
                        description: "enter string type"
                    },
                    cost: {
                        bsonType: "number",
                        description: "enter any number"
                    }, 
                    author: {
                        bsonType: "array",
                        description: "its an array",
                        items: {
                            bsonType: "object",
                            required: ["name"],
                            properties: {
                                name: {
                                    bsonType: "string",
                                    description: "enter a string value"
                                }
                            }

                        }
                    }
                }
                }
            },
            validationAction: "error"
        }
)

// db.user.insertOne({name: "48 laws of power", cost: 111, author: [{"robert"}]})



// concerns 

{ w: <value>, j: <boolean>, wtimeout: <number> }

db.collection_name.insertOne({"//data"}, { writeConcern: {w:0 , j: false , wtimeout: 122 }} ) // wtimeout : read in mili seconds