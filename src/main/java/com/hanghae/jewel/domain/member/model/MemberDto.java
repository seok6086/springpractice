package com.hanghae.jewel.domain.member.model;





public class MemberDto {
    private String name;
    private int height;

    public MemberDto() {

    }

    public MemberDto(String name, int height) {
        this.name = name;
        this.height = height;

    }

    public String getName() {
       return name;
    }

    public int getHeight() {
        return height;

    }

    public void setName(String name) {
        this.name=name;

    }

    public void setHeight(int height) {
        this.height=height;

    }

    public Member toEntity(){
        return new Member(
                null,
                this.name,
                this.height
        );
    }

    public static MemberDto fromEntity(Member member){
        return new MemberDto(
                member.getName(),
                member.getHeight()

        );
    }
}
