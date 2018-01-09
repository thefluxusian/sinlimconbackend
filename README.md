sinlimconbackend
==============
# 현재 진행 상황
* 스프링 기본 설정 완료
* 기본적인 DB 설계 완료 - 추가사항이 생길시 변경 필요
* DB에서 데이터 뽑아 오는것 완료
* API 설계 완료

# 해야할 것들
* 설계된 API에 해당하는 API 생성
* JWT를 이용한 로그인 공부 및 구현
* 리눅스 서버에 실제 API 배포
  * 젠킨스 사용 예정(젠킨스에 대한 간단한 공부)
  * 파일 서버 어떻게 할지에 대한 고민(S3를 이용할것인지 개인적인 파일서버 이용할 이용할것인지)

# RESTFUL API 상태
* ## Resource
  ~~~
  USER {
      userid : VARCHAR
      profileimageurl : VARCHAR
      username : VARCHAR
      email : VARCHAR
      password : VARCHAR
      createtime : TIMESTAMP
      birthdate : DATE
  }
  ~~~

  ~~~
  DESIGN {
    desigid : VARCHAR
    userid : VARCHAR
    firstuploadtime : DATETIME
    lastuploadtime : DATETIME
    price : int
    summary : VARCHAR
  }
  ~~~

  ~~~
  PICTURE {
    pictureid : int
    filesrc : VARCHAR
    design_designid : VARCHAR
  }
  ~~~

  ~~~
  ZZIM {
    zzimid : VARCHAR
    user_userid : VARCHAR
    design_designid : VARCHAR
  }
  ~~~

* ##  주소 설계

| 주소                                     | method | 기능                                      |
|------------------------------------------|--------|-------------------------------------------|
| /designs                                 | GET    | 전체 디자인 조회                          |
| /designs                                 | POST   | 디자인 추가                               |
| /designs/{designid}                      | GET    | designid에 해당하는 디자인 상세 내역 조회 |
| /designs/{designid}                      | PUT    | designid에 해당하는 디자인 수정           |
| /designs/{designid}                      | DELETE | designid에 해당하는 디자인 삭제           |
| /designs/{designid}/pictures             | GET    | designid에 해당하는 전체 사진             |
| /designs/{designid}/pictures             | POST   | desingnid에 해당하는 사진 추가            |
| /designs/{designid}/pictures/{pictureid} | GET    | designid에 해당하는 pictureid 조회        |
| /designs/{designid}/pictures/{pictureid} | PUT    | designid에 해당하는 pictureid 수정        |
| /designs/{designid}/pictures/{pictureid} | DELETE | designid에 해당하는 pictureid 삭제        |
| /users                                   | GET    | 전체 유저 조회                            |
| /users                                   | POST   | 유저 추가                                 |
| /users/{userid}                          | GET    | userid에 해당하는 user조회                |
| /users/{userid}                          | PUT    | userid에 해당하는 user 수정               |
| /users/{userid}                          | DELETE | userid에 해당하는 user 삭제               |



# DB 연결
* End point=designduck.cphno6qganog.ap-northeast-2.rds.amazonaws.com:3306
* User=designduck
* Password=designduck
