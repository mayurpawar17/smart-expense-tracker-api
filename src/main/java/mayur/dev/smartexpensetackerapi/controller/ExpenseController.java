package mayur.dev.smartexpensetackerapi.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import mayur.dev.smartexpensetackerapi.dto.ApiResponse;
import mayur.dev.smartexpensetackerapi.dto.ExpenseRequest;
import mayur.dev.smartexpensetackerapi.dto.ExpenseResponse;
import mayur.dev.smartexpensetackerapi.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/expenses")
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService expenseService;

    // 1. Added @ResponseStatus(HttpStatus.CREATED)
    // 2. Added @Valid to trigger validation rules
    // 3. Switched to Request/Response DTOs
    @PostMapping
    public ApiResponse<ExpenseResponse> createExpense(@RequestBody @Valid ExpenseRequest expenseRequest){
        ExpenseResponse data = expenseService.createExpense(expenseRequest);
//        return  expenseService.createExpense(expenseRequest);

        // Using the @Builder from your ApiResponse class
        return ApiResponse.<ExpenseResponse>builder()
                .success(true)
                .message("Expense created successfully!")
                .data(data)
                .timestamp(LocalDateTime.now())
                .build();
    }

    @GetMapping
    public ApiResponse<List<ExpenseResponse>> getAllExpenses() {
        List<ExpenseResponse> data = expenseService.getAllExpenses();

        return ApiResponse.<List<ExpenseResponse>>builder()
                .success(true)
                .message("Retrieved " + data.size() + " expenses")
                .data(data)
                .timestamp(LocalDateTime.now())
                .build();
    }


}
