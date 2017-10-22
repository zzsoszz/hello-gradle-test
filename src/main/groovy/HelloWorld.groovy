import com.google.gson.Gson

println "hello"
Gson gson=new Gson();
def info=["name":"qingtian","password":123456];
def json=gson.toJson(info);
println json
