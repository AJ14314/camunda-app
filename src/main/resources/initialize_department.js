print("UserObj inside initialize_department.js :: ", JSON.stringify(userObj));
print("UserObj2 inside initialize_department.js :: ", JSON.stringify(userObj2));
print("UserObj3 inside initialize_department.js :: ", JSON.stringify(userObj3));

print("UserObj4 inside initialize_department.js :: ", JSON.stringify(userObj4));
print("UserObj4 inside initialize_department.js via execution.getVariable :: ", JSON.stringify(execution.getVariable("userObj4")));

 var obj = {
    id: 1,
    name: "IT"
};

print("Department Obj :: ", JSON.stringify(obj));
