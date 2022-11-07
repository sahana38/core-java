class TeaStallTester{

   public static void main(String teaStall[]) {
    
     TeaStall.setTeaStallId(5678);
     TeaStall.setName("Beereshwara Cha Angadi");
     TeaStall.setAddress("Malleshwaram");
     TeaStall.setContactNo(345649783L);


     //TeaStall.teaStallId=5678;
     //TeaStall.name="Beereshwara Cha Angadi";
     //TeaStall.address="Malleshwaram";
     //TeaStall.contactNo=345649783L;


 
  //System.out.println(TeaStall.getTeaStallId());
  //System.out.println(TeaStall.getContactNo());
  //System.out.println(TeaStall.getName());
  //System.out.println(TeaStall.getAddress());

 System.out.println(TeaStall.getTeaStallId() + " "+
                     TeaStall.getContactNo() +" "+
                     TeaStall.getName() + " "+
                     TeaStall.getAddress());
 }
}