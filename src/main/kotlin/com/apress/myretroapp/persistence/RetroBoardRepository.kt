@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.apress.myretroapp.persistence

import com.apress.myretroapp.board.Card
import com.apress.myretroapp.board.CardType
import com.apress.myretroapp.board.RetroBoard
import org.springframework.stereotype.Component
import java.util.*

@Component
class RetroBoardRepository : Repository<RetroBoard, UUID> {
    private val retroBoardMap =
        mutableMapOf(
            UUID.fromString("9f0d8eab-d5a0-46b4-8db0-1e2e1d2b8299") to
                RetroBoard(
                    id = UUID.fromString("9f0d8eab-d5a0-46b4-8db0-1e2e1d2b8299"),
                    name = "Spring Boot 3 Meeting",
                    cards =
                        listOf(
                            Card(
                                id = UUID.fromString("1a6942b2-5fcb-4b90-91ae-26c8b2a55e43"),
                                comment = "Happy to meet the team",
                                cardType = CardType.HAPPY,
                            ),
                            Card(
                                id = UUID.fromString("5d98bb76-ec49-4ef8-b361-0e60b365ed4c"),
                                comment = "New Projects",
                                cardType = CardType.HAPPY,
                            ),
                            Card(
                                id = UUID.fromString("b942a6d4-49f4-4bc1-a45d-b246ee2657e3"),
                                comment = "A lot of work",
                                cardType = CardType.MEH,
                            ),
                            Card(
                                id = UUID.fromString("08a5f123-6a91-4d5f-99e9-142d89a2b8c3"),
                                comment = "We need more time to finish",
                                cardType = CardType.SAD,
                            ),
                        ),
                ),
        )

    override fun save(domain: RetroBoard): RetroBoard {
        val boardId = domain.id ?: UUID.randomUUID()
        retroBoardMap[boardId] = domain.copy(id = boardId)
        return retroBoardMap[boardId]!!
    }

    override fun findByID(uuid: UUID): RetroBoard = retroBoardMap[uuid]!!

    override fun findAll(): Iterable<RetroBoard> = retroBoardMap.values

    override fun delete(uuid: UUID) {
        retroBoardMap.remove(uuid)
    }
}
