package com.example.demo.member.repository

import com.example.demo.member.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long> {

    // ID 중복 검사를 위해 필요
    fun findByLoginId(longId: String): Member?
}